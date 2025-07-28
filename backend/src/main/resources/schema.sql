CREATE EXTENSION IF NOT EXISTS postgis;
CREATE TABLE IF NOT EXISTS earthquakes (
    id VARCHAR PRIMARY KEY,
       location TEXT,
       magnitude DOUBLE PRECISION,
       depth DOUBLE PRECISION,
       latitude DOUBLE PRECISION,
       longitude DOUBLE PRECISION,
       time TEXT,
       geom GEOMETRY(Point, 4326)
   );
CREATE INDEX IF NOT EXISTS idx_geom ON earthquakes USING GIST (geom);
