/*
 * Copyright 2023 The Bank of New York Mellon.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package bnymellon.codekatas.coffeeshopkata.food;

import java.util.Objects;

public class Donut implements BakeryItem
{
    private final DonutType donutType;

    public Donut(DonutType donutType)
    {
        this.donutType = donutType;
    }

    @Override
    public double getPrice()
    {
        return 1.75;
    }

    public DonutType getDonutType()
    {
        return this.donutType;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Donut) {
            Donut donut = (Donut) obj;
            return this.getDonutType() == donut.getDonutType();
        }
        return false;
    }

    @Override
    public String toString()
    {
        return String.format("Donut[donutType=%s]",
                this.getDonutType());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(donutType);
    }
}
