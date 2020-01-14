package state;

import state.impl.BlackVoteState;
import state.impl.NormalVoteState;
import state.impl.RepeatVoteState;
import state.impl.SpiteVoteState;

import java.util.HashMap;
import java.util.Map;

public class VoteManager {

    private VoteState state = null;

    private Map<String, String> mapVote = new HashMap<>();

    private Map<String, Integer> mapVoteCount = new HashMap<>();


    public Map<String, String> getMapVote(){
        return mapVote;
    }

    public void vote(String user, String voteItem){
        Integer oldCount = mapVoteCount.get(user);
        if (oldCount == null){
            oldCount = 0;
        }
        oldCount += 1;
        mapVoteCount.put(user, oldCount);

        if (oldCount == 1){
            state = new NormalVoteState();
        }else if (oldCount > 1 && oldCount < 5){
            state = new RepeatVoteState();
        }else if (oldCount >= 5 && oldCount <= 8){
            state = new SpiteVoteState();
        }else if (oldCount > 8){
            state = new BlackVoteState();
        }

        state.vote(user, voteItem, this);

    }


}
