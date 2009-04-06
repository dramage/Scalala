/*
 * Distributed as part of Scalala, a linear algebra library.
 * 
 * Copyright (C) 2008- Daniel Ramage
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.

 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110 USA 
 */
package scalala.tensor;

import scalala.collection.PartialMap;
import scalala.collection.domain.{Domain, Domain1, IntSpanDomain};

/**
 * A standard numerical Tensor1 defined over 0 inclusive to
 * size exclusive.
 * 
 * @author dramage
 */
trait Vector extends Tensor1[Int] {
  def size : Int;
  
  lazy val _domain1 = IntSpanDomain(0, size);
  final override def domain1 : Domain1[Int] = _domain1;
  
  /** Returns an array copy of this tensor. */
  def toArray = Array.fromFunction(i => this(i))(size);
}
