package adapter;

import adapter.impl.ExtensibleCalcLowestPriceServiceImpl;
import adapter.impl.HotelCalcLowestPriceServiceImpl;
import adapter.impl.RouteCalcLowestPriceServiceImpl;
import adapter.impl.TicketCalcLowestPriceServiceImpl;

/**
 * ExtensibleCalcLowestPriceServiceImpl方式
 */
public class Main2 {
    public static void main(String[] args) {
        TicketCalcLowestPriceServiceImpl ticketService = new TicketCalcLowestPriceServiceImpl();
        HotelCalcLowestPriceServiceImpl hotelService = new HotelCalcLowestPriceServiceImpl();
        RouteCalcLowestPriceServiceImpl routeService = new RouteCalcLowestPriceServiceImpl();

        CalcLowestPriceService extensibleService = new ExtensibleCalcLowestPriceServiceImpl();
        ((ExtensibleCalcLowestPriceServiceImpl) extensibleService).addServiceAdapter(ticketService);
        ((ExtensibleCalcLowestPriceServiceImpl) extensibleService).addServiceAdapter(hotelService);
        ((ExtensibleCalcLowestPriceServiceImpl) extensibleService).addServiceAdapter(routeService);

        //客户端调用 组装request
        LowestPriceRequest request = new LowestPriceRequest();
        /**
         * 门票30天内起价：100
         * 酒店30天内起价：200
         * 线路30天内起价：300
         */
        request.setCategory(Category.HOTEL.name());
        request.setDays(30);

        LowestPriceResult result = extensibleService.calcLowestPrice(request);
        System.out.println("extensible lowest price:" + result);



    }
}
