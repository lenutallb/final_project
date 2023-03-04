package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data

public class Mark {

    @Column(nullable=false, unique=true)
    public int mark;

    public Mark() {}
    public Mark(int mark) {
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public boolean isValidMark(){
        if((this.mark<=100)&&(this.mark>=0)) return true;
        else return false;
    }
}
