CREATE EXTENSION IF NOT EXISTS postgis;
CREATE TABLE IF NOT EXISTS earthquakes (
   id SERIAL PRIMARY KEY,
   location TEXT,
   time TEXT,
   magnitude DOUBLE PRECISION,
   depth DOUBLE PRECISION,
   coordinates GEOMETRY(Point, 4326)
 );
