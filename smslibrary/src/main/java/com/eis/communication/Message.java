package com.eis.communication;

import com.eis.communication.header.Header;

import java.io.Serializable;

/**
 * Represents a message with header and payload data
 *
 * @param <H> {@link Header} containing all message's service information
 * @param <D> type of data in the payload
 * @see Serializable
 */
public interface Message<H extends Header<D>, D extends Serializable> extends Serializable {

    /**
     * Gets the payload data contained in this message
     *
     * @return data contained in this message
     */
    D getData();

    /**
     * Gets the header contained in this message
     *
     * @return the header contained in this message
     */
    H getHeader();

}