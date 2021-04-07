package com.switchfully.pettinder.message;

import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
public class MessageMapper {
    public List<MessageDTO> toDTO(List<Message> messageList) {
        return messageList.stream().map(this::toDTO).collect(toList());
    }

    public MessageDTO toDTO(Message message) {
        return new MessageDTO(message.getId(), message.getContent(), message.getCreationDate(), message.getLocation());
    }

    public Message toEntity(MessageDTO messageDTO) {
        return new Message(messageDTO.getContent(), messageDTO.getLocation());
    }
}
