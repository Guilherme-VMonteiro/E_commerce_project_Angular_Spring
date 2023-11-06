import { Component, OnInit } from '@angular/core';
import { Produto } from 'src/app/interfaces/produto';

//Services
import { ProdutosListService } from 'src/app/services/produtos-list.service';

@Component({
  selector: 'app-listaprodutos',
  templateUrl: './listaprodutos.component.html',
  styleUrls: ['./listaprodutos.component.css']
})
export class ListaprodutosComponent implements OnInit{

  public listaDeProdutos: Produto | any = [];

  constructor(private produtosListService: ProdutosListService){}

  ngOnInit(): void {
    this.produtosListService.getProdutos().subscribe(
      res => this.listaDeProdutos = res,
      error => error
    );
  }

}
