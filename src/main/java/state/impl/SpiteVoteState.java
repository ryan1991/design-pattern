package state.impl;

import state.VoteManager;
import state.VoteState;

public class SpiteVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        if (voteManager.getMapVote().containsKey(user)){
            //恶意投票删除记录
            voteManager.getMapVote().remove(user);
        }
        System.out.println("你有恶意刷屏行为，取消投票资格");

    }
}
