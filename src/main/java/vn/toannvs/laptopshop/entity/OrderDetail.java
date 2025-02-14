package vn.toannvs.laptopshop.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "order_details")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order; // Liên kết đến đơn hàng

    @ManyToOne
    @JoinColumn(name = "variant_product_id", nullable = false)
    private VariantProduct variantProduct; // Biến thể sản phẩm được đặt

    @Column(nullable = false)
    private int quantity; // Số lượng sản phẩm

    @Column(nullable = false)
    private double price; // Giá của từng biến thể sản phẩm tại thời điểm đặt hàng

    @Column(nullable = false)
    private double subtotal; // Tổng giá tiền cho biến thể này (quantity * price)

    // Tính toán subtotal khi quantity hoặc price thay đổi
    public void calculateSubtotal() {
        this.subtotal = this.quantity * this.price;
    }
}