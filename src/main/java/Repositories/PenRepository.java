package Repositories;

import Products.Pen;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class PenRepository
{
    private Map<String, Pen>penShop=new HashMap<>();

    public String addPenToShop(Pen pen)
    {
        String pId=pen.getpId();
        penShop.put(pen.getpId(),pen);
        return "The of Companey-"+pId+" has been added to shop successfully";
    }

    public List<Pen> getPens(){
        List<Pen>pens=new ArrayList<>();
        for(Pen p:penShop.values()){
            pens.add(p);
        }
        return pens;
    }

}
