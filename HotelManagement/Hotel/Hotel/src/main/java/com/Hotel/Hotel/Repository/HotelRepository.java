package com.Hotel.Hotel.Repository;

import com.Hotel.Hotel.Model.HotelInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<HotelInfo,Long>
{

}