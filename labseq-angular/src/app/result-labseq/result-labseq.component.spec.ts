import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ResultLabseqComponent } from './result-labseq.component';

describe('ResultLabseqComponent', () => {
  let component: ResultLabseqComponent;
  let fixture: ComponentFixture<ResultLabseqComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ResultLabseqComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ResultLabseqComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
