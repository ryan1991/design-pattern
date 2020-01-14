package state.impl;

import state.VoteManager;
import state.VoteState;

public class RepeatVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {

        System.out.println("请不要重复投票");
    }
}
