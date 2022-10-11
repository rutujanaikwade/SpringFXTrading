import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FxdetailsComponent } from './fxdetails.component';

describe('FxdetailsComponent', () => {
  let component: FxdetailsComponent;
  let fixture: ComponentFixture<FxdetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FxdetailsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FxdetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
