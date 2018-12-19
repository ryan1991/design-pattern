package adapter;

import adapter.impl.HotelCalcLowestPriceServiceImpl;
import adapter.impl.RouteCalcLowestPriceServiceImpl;
import adapter.impl.SmartCalcLowestPriceServiceImpl;
import adapter.impl.TicketCalcLowestPriceServiceImpl;


/**
 * 通过增加新的Service的方式，可以扩展新的品类
 * SmartCalcLowestPriceServiceImpl方式
 */
public class Main {
    public static void main(String[] args) {
        TicketCalcLowestPriceServiceImpl ticketService = new TicketCalcLowestPriceServiceImpl();
        HotelCalcLowestPriceServiceImpl hotelService = new HotelCalcLowestPriceServiceImpl();
        RouteCalcLowestPriceServiceImpl routeService = new RouteCalcLowestPriceServiceImpl();

        CalcLowestPriceService smartService = new SmartCalcLowestPriceServiceImpl();
        ((SmartCalcLowestPriceServiceImpl) smartService).registerService(ticketService.category(), ticketService);
        ((SmartCalcLowestPriceServiceImpl) smartService).registerService(hotelService.category(), hotelService);
        ((SmartCalcLowestPriceServiceImpl) smartService).registerService(routeService.category(), routeService);


        //客户端调用 组装request
        LowestPriceRequest request = new LowestPriceRequest();
        /**
         * 门票30天内起价：100
         * 酒店30天内起价：200
         * 线路30天内起价：300
         */
        request.setCategory(Category.TICKET.name());
        request.setDays(30);

        LowestPriceResult result = smartService.calcLowestPrice(request);
        System.out.println("smart lowest price:" + result);


    }
}
