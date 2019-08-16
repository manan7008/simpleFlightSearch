
package com.flightmgr.service;

import com.flightmgr.model.FlightInfo;
import com.flightmgr.model.SearchRequest;
import com.flightmgr.repo.FlightData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {

    @Autowired
    private FlightData data;

    public List<FlightInfo> find(SearchRequest request){
        return data.findBy(request);
    }
}
