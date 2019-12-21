package com.eis.smslibrary.header;

import androidx.annotation.NonNull;

import com.eis.communication.header.DestinationPeerHeader;
import com.eis.smslibrary.SMSPeer;

/**
 * SMSToSendHeader is {@link AbstractSMSHeader} extension implementing {@link DestinationPeerHeader} in order to obtain a suitable header for {@link com.eis.smslibrary.message.SMSMessageToSend}
 *
 * @author Mattia Fanan
 * @since 08/12/2019 (gg/mm/aaaa)
 */
public final class SMSToSendHeader extends AbstractSMSHeader implements DestinationPeerHeader<SMSPeer, String> {

    /**
     * Constructor for SMSToSendHeader
     *
     * @param destinationPeer the peer to store in this header
     * @throws IllegalArgumentException when null peer found
     */
    public SMSToSendHeader(@NonNull SMSPeer destinationPeer) throws IllegalArgumentException {
        super(destinationPeer);
    }


    /**
     * Gets the destination peer stored in this header
     *
     * @return the destination peer stored in this header
     */
    @Override
    public SMSPeer getDestination() {
        return peer;
    }

    /**
     * Indicates whether some other object is "equal to" this one
     *
     * @param o The reference object with which to compare.
     * @return <code>true</code> if this object is the same as the obj argument; <code>false</code>otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (!(o instanceof SMSToSendHeader))
            return false;

        SMSToSendHeader header = (SMSToSendHeader) o;

        return peer.equals(header.getDestination());
    }

    /**
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        return 47 * 7 * peer.hashCode();
    }
}
