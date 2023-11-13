import { Component, OnInit } from '@angular/core';
import { Produto } from 'src/app/interfaces/produto';
import { ProdutosListService } from 'src/app/services/produtos-list.service';

@Component({
  selector: 'app-admin-panel',
  templateUrl: './admin-panel.component.html',
  styleUrls: ['./admin-panel.component.css']
})
export class AdminPanelComponent implements OnInit{

  public listaDeProdutos: Produto | any = [];

  public editar: boolean = false

  public produtoSelecionado = null;

  constructor(private produtosListService: ProdutosListService){}

  ngOnInit(): void {
    this.produtosListService.getProdutos().subscribe(
      res => this.listaDeProdutos = res,
      error => error
    );
  }

  public ativarEditar(){
    if(this.editar == true){
      this.editar = false;
    }else{
      this.editar = true
    }
  }

  public coletarProduto(index: number){
    this.produtoSelecionado = this.listaDeProdutos[index]
    console.log(this.produtoSelecionado);
  }
}
