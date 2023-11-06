import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home/home.component';
import { ProdutoComponent } from './components/produto/produto.component';
import { ListaprodutosComponent } from './components/listaprodutos/listaprodutos.component';
import { HeaderComponent } from './components/header/header.component';
import { CarroselComponent } from './components/carrosel/carrosel.component';
import { ListaSectionComponent } from './components/lista-section/lista-section.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ProdutoComponent,
    ListaprodutosComponent,
    HeaderComponent,
    CarroselComponent,
    ListaSectionComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
