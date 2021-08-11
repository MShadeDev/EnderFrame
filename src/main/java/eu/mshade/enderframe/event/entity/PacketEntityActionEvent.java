package eu.mshade.enderframe.event.entity;

import eu.mshade.enderframe.event.PacketEvent;
import eu.mshade.enderframe.metadata.ActionType;

public class PacketEntityActionEvent implements PacketEvent {

    private final ActionType actionType;
    private final int actionParameter;

    public PacketEntityActionEvent(ActionType actionType, int actionParameter) {
        this.actionType = actionType;
        this.actionParameter = actionParameter;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public int getActionParameter() {
        return actionParameter;
    }
}