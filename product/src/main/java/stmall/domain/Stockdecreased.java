package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Stockdecreased extends AbstractEvent {

    private Long id;

    public Stockdecreased(Product aggregate) {
        super(aggregate);
    }

    public Stockdecreased() {
        super();
    }
}
//>>> DDD / Domain Event
