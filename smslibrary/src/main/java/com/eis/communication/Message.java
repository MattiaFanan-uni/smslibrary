package com.eis.communication;

import com.eis.communication.header.Header;

import java.io.Serializable;

/**
 * Represents the abstraction of a PDU -Protocol Data Unit-
 * <a href="https://en.wikipedia.org/wiki/Protocol_data_unit">more info about PDU</a>
 *
 * @param <H> type of {@link Header} containing all information that should be stored in the PCI -Protocol Control Information- part of the PDU
 * @param <D> type of data contained in the payload (in a PDU payload is the SDU -Service Data Unit-)
 * @see Serializable
 */
public interface Message<H extends Header<D>, D extends Serializable> extends Serializable {

    /**
     * Gets the data contained in the payload of this message
     *
     * @return the data contained in the payload of this message
     */
    D getData();

    /**
     * Gets the header contained in this message
     *
     * @return the header contained in this message
     */
    H getHeader();

}