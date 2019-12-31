package com.eis.smslibrary.message;

import androidx.annotation.NonNull;

import com.eis.smslibrary.exceptions.InvalidSMSMessageException;
import com.eis.smslibrary.header.SMSReceivedHeader;

/**
 * SMSReceivedHeader is an {@link AbstractSMSMessage} extension taking as <code>Header</code> {@link SMSReceivedHeader}
 *
 * @author Mattia Fanan
 * @since 08/12/2019 (gg/mm/aaaa)
 */
public final class SMSMessageReceived extends AbstractSMSMessage<SMSReceivedHeader> {

    /**
     * Constructor for SMSMessageReceived
     *
     * @param messageHeader the header of the this message
     * @param messageText   the content of this message, can be empty but not null
     * @throws InvalidSMSMessageException if {@link AbstractSMSMessage#checkMessageText} is different from MESSAGE_TEXT_VALID
     * @throws IllegalArgumentException if <code>messageText</code> or <code>messageHeader</code> are <code>null</code>
     */
    public SMSMessageReceived(@NonNull final SMSReceivedHeader messageHeader, @NonNull final String messageText) throws InvalidSMSMessageException,IllegalArgumentException {
        super(messageHeader, messageText);
    }

}



