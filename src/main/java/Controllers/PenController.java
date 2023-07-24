package Controllers;

import Products.Pen;
import Services.PenSerives;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PenController
{
    @Autowired
    private PenSerives penSerives;

    @PostMapping("/pens")
    public String addPenToShop(@RequestBody Pen pen)
    {
        String ans= penSerives.addPenToRepository(pen);
        return ans;
    }
}
