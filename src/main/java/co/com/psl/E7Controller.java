package co.com.psl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class E7Controller {

    @RequestMapping("/E7")
    public String index() {
        return "<h1>Integrantes :</h1>" +
                "<ul>" +
                "<li>Edwin Arley Rengifo Villa </li> <img src=https://scontent.feoh3-1.fna.fbcdn.net/v/t1.0-9/51753216_2262582003979514_6462834498009563136_n.jpg?_nc_cat=102&_nc_ht=scontent.feoh3-1.fna&oh=127f82cd516a2541cca341fb7ace64b0&oe=5D22E9A1 width=300 height=300>"+
                "<li> Joshua Sanchez Alvarez </li> <img src=https://scontent.feoh3-1.fna.fbcdn.net/v/t1.15752-9/52702640_400827957153690_3380542847143903232_n.png?_nc_cat=110&_nc_ht=scontent.feoh3-1.fna&oh=f8f796ec7abffb68c420a295f8f40a6d&oe=5D24F60B width=300 height=300>" +
                "<li> Camilo Villa Restrepo </li> <img src=https://scontent.feoh3-1.fna.fbcdn.net/v/t1.15752-9/52601823_286903745338601_1559758467789488128_n.png?_nc_cat=109&_nc_ht=scontent.feoh3-1.fna&oh=e15bfa82fee977e7b4735f8995e2379e&oe=5CDF928F width=300 height=300>" +
                "<li> Miguel Angel Ortiz Arboleda</li> <img src=https://scontent.feoh3-1.fna.fbcdn.net/v/t1.0-9/51253889_2055181301197350_1096437930135650304_n.jpg?_nc_cat=107&_nc_ht=scontent.feoh3-1.fna&oh=2d69d20a157c7bdde5567e96faf0267f&oe=5D219E79 width=300 height=300>" +
                "<li> Juan Pablo Zapata Raigoza</li> <img src=https://scontent.feoh3-1.fna.fbcdn.net/v/t1.15752-9/53164989_2277849229125559_2019720607305826304_n.png?_nc_cat=106&_nc_ht=scontent.feoh3-1.fna&oh=7b488eb819d40e144ba2c911e8bd8881&oe=5D2718EB width=300 height=300>" +
                "</ul>";
    }

}