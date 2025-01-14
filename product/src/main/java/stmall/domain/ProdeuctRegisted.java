package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ProdeuctRegisted extends AbstractEvent {

    private Long id;

    public ProdeuctRegisted(Product aggregate) {
        super(aggregate);
    }

    public ProdeuctRegisted() {
        super();
    }
}
//>>> DDD / Domain Event
