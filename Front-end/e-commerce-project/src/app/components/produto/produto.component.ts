import { Component, Input } from '@angular/core';
import { Produto } from 'src/app/interfaces/produto';

@Component({
  selector: 'app-produto',
  templateUrl: './produto.component.html',
  styleUrls: ['./produto.component.css']
})
export class ProdutoComponent {

  @Input() public produto: Produto = {
    id: 0,
    nome: '',
    descricao: '',
    urlImagem: '',
    quantidadeDisponivel: 0,
    preco: 0
  };


}
