package Services;

import Products.Pen;
import Repositories.PenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PenSerives
{
    @Autowired
    private PenRepository pr;
    public String addPenToRepository(Pen pen){
        String ans=pr.addPenToShop(pen);
        return ans;
    }
    public List<String>getPens()
    {
        List<Pen>list=pr.getPens();
        List<String>penList=new ArrayList<>();
        for(Pen p:list)
        {
            penList.add(p.toString());
        }
        return penList;
    }
}
