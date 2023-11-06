import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Produto } from '../interfaces/produto';

@Injectable({
  providedIn: 'root',
})
export class ProdutosListService {

  constructor(private http: HttpClient) {}

  public getProdutos(): Observable<Produto> {
    return this.http.get<Produto>('http://localhost:8080/produto').pipe(
      (res) => res,
      (error) => error
    );
  }
}
