/**
 * Created by astro1961 on 12.11.2016.
 */
public class FSM {
    private Action activeState;










    public void setActiveState(Action activeState) {
        this.activeState = activeState;
    }

    public Action getActiveState() {
        return activeState;
    }

    public void update(States states) {
        switch(states){


            case CONNECTED:
                System.out.println("is connected");
                break;
            case DISCONNECTED:
                activeState =
                System.out.println("is disconnected");
                break;
        }
    }


}
