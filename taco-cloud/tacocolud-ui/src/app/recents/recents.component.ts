import { Component, OnInit, Injectable } from '@angular/core';
import { Http } from '@angular/http';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'recent-tacos',
  templateUrl: 'recents.component.html',
  styleUrls: ['./recents.component.css']
})

@Injectable()
export class RecentTacosComponent implements OnInit {
  recentTacos: any;

  constructor(private httpClient: HttpClient) { }

  ngOnInit() {
  	// 최근 생성된 타코들을 서버에서 가져온다.
    this.httpClient.get('http://localhost:8080/design/recent') // <1>
        .subscribe(data => this.recentTacos = data);
  }
}
