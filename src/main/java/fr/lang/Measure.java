package fr.lang;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by philippe on 30/10/2016.
 */

@Entity
@Table(name = "historyarch")
public class Measure {

    @Id @Column (name = "cmd_id")   private Long cmdId;
        @Column (name = "datetime") private Date timeTag;
        @Column (name = "value")    private float  value;


    protected Measure() {

    }

    public Long getCmdId() {
        return cmdId;
    }

    public void setCmdId(Long cmdId) {
        this.cmdId = cmdId;
    }

    public Date getTimeTag() {
        return timeTag;
    }

    public void setTimeTag(Date timeTag) {
        this.timeTag = timeTag;
    }

    public Measure(Date timeTag, float measure) {
        this.timeTag = timeTag;
        this.value = measure;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format(
                "Measure[id=%d, timegtag='%s', value='%s']",
                cmdId, timeTag, value);
    }

}


