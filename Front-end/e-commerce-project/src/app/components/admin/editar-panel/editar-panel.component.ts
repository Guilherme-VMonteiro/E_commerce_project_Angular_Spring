import { Component, EventEmitter, Input, Output } from '@angular/core';
import { Produto } from 'src/app/interfaces/produto';

@Component({
  selector: 'app-editar-panel',
  templateUrl: './editar-panel.component.html',
  styleUrls: ['./editar-panel.component.css']
})
export class EditarPanelComponent {

  @Output() fechar = new EventEmitter<void>();

  @Input() public produto: Produto | any;

  public fecharPainel() {
    this.fechar.emit();
  }

  public atualizar(){
    console.log(this.produto);
  }
}
