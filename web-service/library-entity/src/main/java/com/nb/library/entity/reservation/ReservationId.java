package com.nb.library.entity.reservation;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ReservationId implements Serializable {

    @Column(name = "user_id")
    private Integer userId;
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Column(name = "work_id")
    private Integer workId;
    public Integer getWorkId() {
        return workId;
    }
    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    private ReservationId() {}

    public ReservationId(Integer userId, Integer workId) {
        this.userId = userId;
        this.workId = workId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReservationId that = (ReservationId) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(workId, that.workId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, workId);
    }
}
