package cn.roverweb.seckill.rabbitmq;

import cn.roverweb.seckill.bean.User;
import lombok.Data;

@Data
public class SeckillMessage {

    private User user;
    private long goodsId;

}
