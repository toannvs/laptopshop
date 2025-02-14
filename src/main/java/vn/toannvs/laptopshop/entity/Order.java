package vn.toannvs.laptopshop.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // Người đặt hàng

    private LocalDateTime orderDate;

    @ManyToOne
    @JoinColumn(name = "order_status_id", nullable = false)
    private OrderStatus orderStatus;

    private double totalPrice;

    @Column(nullable = false)
    private String recipientName; // Họ và tên người nhận

    @Column(nullable = false)
    private String recipientAddress; // Địa chỉ của người nhận

    @Column(nullable = false)
    private String recipientPhone; // Số điện thoại người nhận

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderDetail> orderDetails;
}