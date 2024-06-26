package org.choongang.global.socket;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocketData {
    private String from; // 보내는쪽
    private String to; // 받는 쪽
    private String message;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime regDt;

    public SocketData(String to, String message) {
        this.to = to;
        this.message = message;
    }

    public SocketData(String to) {
        this.to = to;
    }
}