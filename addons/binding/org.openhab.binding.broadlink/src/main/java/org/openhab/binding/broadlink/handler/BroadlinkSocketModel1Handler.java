package org.openhab.binding.broadlink.handler;

import org.eclipse.smarthome.core.library.types.OnOffType;
import org.eclipse.smarthome.core.thing.ChannelUID;
import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.types.Command;

public class BroadlinkSocketModel1Handler extends BroadlinkSocketHandler {

    public BroadlinkSocketModel1Handler(Thing thing) {
        super(thing);
    }

    public void setStatusOnDevice(int state) {
        byte payload[] = new byte[16];
        payload[0] = (byte) state;
        byte message[] = buildMessage((byte) 102, payload);
        sendDatagram(message);
    }
}