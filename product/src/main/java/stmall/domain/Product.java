package stmall.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import stmall.ProductApplication;
import stmall.domain.ProdeuctRegisted;
import stmall.domain.SoldOut;
import stmall.domain.Stockdecreased;

@Entity
@Table(name = "Product_table")
@Data
//<<< DDD / Aggregate Root
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productName;

    private Integer stock;

    public static ProductRepository repository() {
        ProductRepository productRepository = ProductApplication.applicationContext.getBean(
            ProductRepository.class
        );
        return productRepository;
    }

    //<<< Clean Arch / Port Method
    public static void decreaseStock(OrderPlaced orderPlaced) {
        //implement business logic here:

        /** Example 1:  new item 
        Product product = new Product();
        repository().save(product);

        SoldOut soldOut = new SoldOut(product);
        soldOut.publishAfterCommit();
        Stockdecreased stockdecreased = new Stockdecreased(product);
        stockdecreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        // if orderPlaced.pgId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> orderMap = mapper.convertValue(orderPlaced.getPgId(), Map.class);

        repository().findById(orderPlaced.get???()).ifPresent(product->{
            
            product // do something
            repository().save(product);

            SoldOut soldOut = new SoldOut(product);
            soldOut.publishAfterCommit();
            Stockdecreased stockdecreased = new Stockdecreased(product);
            stockdecreased.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
