import { Component } from '@angular/core';
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Observable } from 'rxjs';

export class User {
	username: string | undefined;
	password: string | undefined;

	constructor(username: string, password: string) {
		this.username = username;
		this.password = password;
	}
}

//Not sure
export class UserDetails {
	aadhaarNumber: any | undefined;

	constructor(aadhaarNumber: any) {
		this.aadhaarNumber = aadhaarNumber;
	}
}

@Component({
	selector: 'app-root',
	templateUrl: './app.component.html',
	styleUrls: ['./app.component.css']
})
export class AppComponent {
	title = 'pension-ui-angular';
	jwtToken = '';

	// Reirecting to login page at start
	flag = 1;

	pensionDetails: any;
	processPension: any;
	aadhaarNumber: any;
	pensionAmount: any;

	onClickSubmit(result: { username: string, password: string }) {
		console.log('username: ' + result.username);
		console.log('password: ' + result.password);

		this.getJwtToken(new User(result.username, result.password))
			.subscribe
			(
				data => {
					console.log("Token at auth - " + data.jwt);
					this.jwtToken = data.jwt;

					this.flag = 2;
				}
			);
	}

	onClickSubmitAadhar(result: { aadhaarNumber: string }) {
		console.log("Aadhaar Id entered - " + this.aadhaarNumber);

		this.aadhaarNumber = result.aadhaarNumber;

		this.postcomments(new UserDetails(result.aadhaarNumber))
			.subscribe 
			(
				data => {
					console.log(`aadhaar inside post - ${this.aadhaarNumber}`);
					this.pensionAmount = data.pensionAmount;
				}
			)
		

		
	}


	// GET JWT TOKEN Function
	constructor(private httpClient: HttpClient) {

	}
	getJwtToken(user: User): Observable<any> {
		const headers = new HttpHeaders().set(
			'Content-Type', 'application/json')

		return this.httpClient.post("http://localhost:8080/authenticate", JSON.stringify(user), { headers })
	}

	// Post Request sent
	postcomments(userDetails: UserDetails): Observable<any> {
		console.log("The token inside post method call - " + this.jwtToken);
		const headers = new HttpHeaders().set(
			'Authorization', 'Bearer ' + this.jwtToken
		)
		return this.httpClient.post(`http://localhost:8100/ProcessPension/${userDetails.aadhaarNumber}`, {headers});
	}
}