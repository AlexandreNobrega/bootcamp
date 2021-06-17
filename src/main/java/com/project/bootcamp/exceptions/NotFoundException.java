package com.project.bootcamp.exceptions;

import com.project.bootcamp.util.MessageUtils;

public class NotFoundException extends RuntimeException {

    //Como a mensagem de retorno da exception é especifica, foi chamado diretamente o 'MessageUtils.NO_RECORDS_FOUND'
    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
