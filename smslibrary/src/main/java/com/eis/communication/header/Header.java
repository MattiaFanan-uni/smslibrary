package com.eis.communication.header;

import java.io.Serializable;

/**
 * Represents a PCI -Protocol Control Information- containing all service information a PDU needs to store
 *
 * @param <T> type of data in which the header information is saved
 * @author Mattia Fanan
 * @see Serializable
 * @see com.eis.communication.Message
 * @since 08/12/2019 (gg/mm/aaaa)
 */
public interface Header<T extends Serializable> extends Serializable {
    /**
     * Gets the identifier of the PDU type the Message having this header is implementing
     *
     * @return the identifier of the PDU type the Message having this header is implementing
     */
    T getID();
}
