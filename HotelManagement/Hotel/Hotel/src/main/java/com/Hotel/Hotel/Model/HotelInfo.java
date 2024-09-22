package com.Hotel.Hotel.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
public class HotelInfo
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long TableId;
    private String DishName;
    private String DishPrice;
    private String WaiterName;

    public HotelInfo(long tableId, String dishName, String dishPrice, String waiterName) {
        TableId = tableId;
        DishName = dishName;
        DishPrice = dishPrice;
        WaiterName = waiterName;
    }

    public long getTableId() {
        return TableId;
    }

    public void setTableId(long tableId) {
        TableId = tableId;
    }

    public String getDishName() {
        return DishName;
    }

    public void setDishName(String dishName) {
        DishName = dishName;
    }

    public String getDishPrice() {
        return DishPrice;
    }

    public void setDishPrice(String dishPrice) {
        DishPrice = dishPrice;
    }

    public String getWaiterName() {
        return WaiterName;
    }

    public void setWaiterName(String waiterName) {
        WaiterName = waiterName;
    }
}
