package com.switchfully.pettinder.message;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MessageService {

    private final MessageRepository messageRepository;
    private final MessageMapper messageMapper;

    public MessageService(MessageRepository messageRepository, MessageMapper messageMapper) {
        this.messageRepository = messageRepository;
        this.messageMapper = messageMapper;
    }

    public List<MessageDTO> getAllMessages() {
        return messageMapper.toDTO(messageRepository.findAll());
    }

    public void addMessage(MessageDTO messageDTO) {
        messageRepository.save(messageMapper.toEntity(messageDTO));
    }

    public MessageDTO deleteMessage(Long messageId) {
        Message message = messageRepository.findById(messageId).orElseThrow(RuntimeException::new);
        messageRepository.deleteById(messageId);
        return messageMapper.toDTO(message);
    }
}
