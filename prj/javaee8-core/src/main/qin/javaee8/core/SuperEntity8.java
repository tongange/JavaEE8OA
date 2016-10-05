package qin.javaee8.core;

import qin.javaee65.core.hibernate.SuperEntity65;

import java.io.Serializable;

/**
 * JavaEE8版的超级实体类
 *
 * @param <T> 实现<code>{@link Serializable}</code>的实体类
 * @author qinzhengying
 * @since 1.8
 */
public interface SuperEntity8<T extends Serializable> extends SuperEntity65<T>, JavaEE8BaseSupport
{
}