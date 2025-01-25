import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LabseqServiceService {

  private apiUrl = "http://localhost:8080/labseq/"

  constructor(private http: HttpClient) { }

  getLabSeqNum(n: number): Observable<number> {
    return this.http.get<number>(`${this.apiUrl}${n}`, {
      headers: {
        'Content-Type': 'application/json',
        'Accept': 'application/json'
      }
    })

  }
}
