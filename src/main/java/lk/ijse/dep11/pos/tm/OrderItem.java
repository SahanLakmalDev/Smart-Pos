package lk.ijse.dep11.pos.tm;

import com.jfoenix.controls.JFXButton;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {
    private String code;
    private String description;
    private int qty;
    private BigDecimal unitPrice;
    private JFXButton btnDelete;

    public BigDecimal getTotal() {
        return unitPrice.multiply(new BigDecimal(qty)).setScale(2);
    }
}
