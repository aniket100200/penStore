package Services;

import Products.Pen;
import Repositories.PenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PenSerives
{
    @Autowired
    private PenRepository pr;
    public String addPenToRepository(Pen pen){
        String ans=pr.addPenToShop(pen);
        return ans;
    }
}
