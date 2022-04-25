package br.com.msaorim.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.msaorim.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Aspirador de Pó Portátil para Carros");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/51rLEut98FL._AC_SL1000_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Wap-Aspirador-Car-Fw006449-12V/dp/B07Z5CNHWZ?pf_rd_r=Y78JT2FW6HFHEXRY19ZK&pf_rd_p=7fca0d32-18a1-413d-8197-d7a1ad5a1c72&pd_rd_r=0cb4d335-f8be-480e-8ae3-ec31f0a7de98&pd_rd_w=B5AK4&pd_rd_wg=5T4Cr&ref_=pd_gw_unk");
		pedido.setDescricao("Uma descrição qualquer para este produto");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		return "home";
	}
}
