
# Event Management System


### Event Management System API Endpoints

#### 1. **Create a New Event**
- **URL:** `POST /api/events`


#### 2. **Get All Events**
- **URL:** `GET /api/events`

#### 3. **Get Event by ID**
- **URL:** `GET /api/events/{id}`

#### 4. **Update Event**
- **URL:** `PUT /api/events/{id}`


#### 5. **Delete Event**
- **URL:** `DELETE /api/events/{id}`
- **No request body needed**

#### 6. **Get Event by Venue**
- **URL:** `GET /api/events/venue/{venueId}`

#### 7. **Get Events by Organizer**
- **URL:** `GET /api/events/organizer/{organizerId}`

### Venue Management System API Endpoints

#### 1. **Create a New Venue**
- **URL:** `POST /api/venues`


#### 2. **Get Venue by ID**
- **URL:** `GET /api/venues/{id}`

#### 3. **Update Venue**
- **URL:** `PUT /api/venues/{id}`

```

#### 4. **Delete Venue**
- **URL:** `DELETE /api/venues/{id}`
- **No request body needed**

### Organizer Management System API Endpoints

#### 1. **Create a New Organizer**
- **URL:** `POST /api/organizers`


#### 2. **Get Organizer by ID**
- **URL:** `GET /api/organizers/{id}`

#### 3. **Update Organizer**
- **URL:** `PUT /api/organizers/{id}`

```

#### 4. **Delete Organizer**
- **URL:** `DELETE /api/organizers/{id}`
- **No request body needed**

### Swagger UI

To access the Swagger UI for API documentation, navigate to `http://localhost:8080/swagger-ui.html` in your browser. Swagger UI provides an interactive documentation where you can test the API endpoints and see detailed information about each operation.

