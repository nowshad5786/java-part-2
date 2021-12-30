import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private baseUrl="http://localhost:8092/api/Getemployees";
  constructor(private http:HttpClient) { }
  getEmployees():Observable<Employee[]>
  {
    return this.http.get<Employee[]>(`${this.baseUrl}`);
  }
}
