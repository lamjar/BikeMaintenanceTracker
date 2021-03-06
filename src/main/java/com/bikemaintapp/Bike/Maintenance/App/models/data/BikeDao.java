package com.bikemaintapp.Bike.Maintenance.App.models.data;


import com.bikemaintapp.Bike.Maintenance.App.models.Bike;
import com.bikemaintapp.Bike.Maintenance.App.models.Ride;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface BikeDao extends CrudRepository<Bike,Integer> {

    List<Bike> findBikeByUser_Id(int bikeID); // This finds bike based off user/session id



}
