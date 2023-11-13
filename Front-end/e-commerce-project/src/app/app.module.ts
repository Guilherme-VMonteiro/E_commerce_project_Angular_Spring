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
import { AdminPageComponent } from './components/admin/admin-page/admin-page.component';
import { AdminHeaderComponent } from './components/admin/admin-header/admin-header.component';
import { AdminPanelComponent } from './components/admin/admin-panel/admin-panel.component';
import { EditarPanelComponent } from './components/admin/editar-panel/editar-panel.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ProdutoComponent,
    ListaprodutosComponent,
    HeaderComponent,
    CarroselComponent,
    ListaSectionComponent,
    AdminPageComponent,
    AdminHeaderComponent,
    AdminPanelComponent,
    EditarPanelComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
