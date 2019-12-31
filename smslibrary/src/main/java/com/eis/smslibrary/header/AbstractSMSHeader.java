package com.eis.smslibrary.header;

import androidx.annotation.NonNull;

import com.eis.communication.header.Header;
import com.eis.smslibrary.SMSPeer;

/**
 * AbstractSMSHeader is the base {@link Header} having all the common properties an {@link Header} in this layer must have
 * <ul>
 * <li>a protocol identifier</li>
 * <li>a {@link SMSPeer} peer</li>
 * </ul>
 * <i>Used as a base for building other more complex data-link headers without code replication</i>
 *
 * @author Mattia Fanan
 * @see Header
 * @since 08/12/2019 (gg/mm/aaaa)
 */
public class AbstractSMSHeader implements Header<String> {
    //protocol identifier
    public static final String ID = "ϕ";
    protected final SMSPeer peer;

    /**
     * Constructor for AbstractSMSHeader
     *
     * @param peer the peer to be stored in this header
     * @throws IllegalArgumentException when <code>peer</code> passed is null
     */
    protected AbstractSMSHeader(@NonNull SMSPeer peer) throws IllegalArgumentException{
        if (peer == null)
            throw new IllegalArgumentException();

        this.peer = peer;
    }

    /**
     * Gets the identifier of the PDU type the Message having this header is implementing
     *
     * @return the identifier of the PDU type the Message having this header is implementing
     */
    @Override
    public String getID() {
        return ID;
    }
}
